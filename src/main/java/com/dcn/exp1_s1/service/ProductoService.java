package com.dcn.exp1_s1.service;


import com.dcn.exp1_s1.entity.Producto;

import java.util.List;

public interface ProductoService{
	List<Producto> getProductos();
	Producto addProducto(Producto producto);
	boolean removeProducto(Long idProducto);


}
