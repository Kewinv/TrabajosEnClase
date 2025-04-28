package com.fortbank.ATM.services;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fortbank.ATM.entity.Cliente;
import com.fortbank.ATM.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService 
{
    private final ClienteRepository clienteRepository;

    public Cliente crearCliente(Cliente cliente)
    {
        cliente.setBloqueado(false);
        cliente.setIntentosFallidos(0);
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente>buscarPorIdentificacion(String identificacion)
    {
        return clienteRepository.findByIdentificacion(identificacion);
    }

    public boolean validarPin(Cliente cliente, String pin)
    {
        if(cliente.isBloqueado()) return false;

        if(cliente.getPin().equals(pin))
        {
            cliente.setIntentosFallidos(0);
            clienteRepository.save(cliente);
            return true;
        }else{
            int intentos = cliente.getIntentosFallidos() + 1;
            cliente.setIntentosFallidos(intentos);
            if(intentos >= 3)
            {
                cliente.setBloqueado(true);
            }
            clienteRepository.save(cliente);
            return false;
        }
    }
}
