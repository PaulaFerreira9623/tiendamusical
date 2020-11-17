/**
 * 
 */
package com.devpredator.tiendamusicalservices.service;

import java.util.List;

import com.devpredator.tiendamusicalentities.dto.ArtistaAlbumDTO;

/**
 * @author DevPredator
 * Interface que define los metodos de logica de negocio para la pantalla del home.
 */
public interface HomeService {
	/**
	 * Metodo que permite consultar los albums con base al filtro que ingrese el cliente en el buscador de su home.
	 * @param filtro {@link String} texto ingresado por el cliente.
	 * @return {@link List} lista de albums que coinciden con el texto ingresado.
	 */
	List<ArtistaAlbumDTO> consultarAlbumsFiltro(String filtro);
}
