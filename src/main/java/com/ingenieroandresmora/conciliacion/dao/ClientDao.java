package com.ingenieroandresmora.conciliacion.dao;

import java.util.List;

import com.ingenieroandresmora.conciliacion.model.Client;

public interface ClientDao {

	void saveClient(Client Client);
	
	void deleteClientById(Long idClient);
	
	void updateClient(Client Client);
	
	List<Client> findAllClients();
	
	Client findById(Long idClient);
	
	Client findByEmail(String email);
	
	Client login(String email,String pass);
}
