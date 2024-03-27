package com.ps.service;

import com.ps.model.Cliente;

import java.util.List;

public interface IClienteService {
    public Cliente Registrar(Cliente cliente);

    Cliente getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(Long id);

    List<Cliente> getClienteByName(String nombre);
}
