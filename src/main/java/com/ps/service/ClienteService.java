package com.ps.service;

import com.ps.model.Cliente;
import com.ps.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {


    @Override
    public Cliente Registrar(Cliente cliente) {
        return null;
    }

    private final ClienteRepository clienteRepository;
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> getClienteByName(String nombre) {
        return clienteRepository.findAllByNombre(nombre);
    }
}
