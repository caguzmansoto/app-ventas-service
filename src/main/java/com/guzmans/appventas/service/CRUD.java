package com.guzmans.appventas.service;

import java.util.List;

public interface CRUD<T> {
	T guardar(T obj);
	T actualizar(T obj);
	List<T> listarTodo();
	T buscarPorId(Long id);
	boolean eliminar(Long id);
}
