package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	/**
	 * Añade o actualiza un usuario
	 * @param user
	 * @return el user guardado
	 */
	User save(User user);
	/**
	 * Lista los usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();
	/**
	 * Elimina un usuario mediante el id
	 * @param id
	 */
	void deleteUser(Long id);

}
