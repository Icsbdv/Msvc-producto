package com.bdv.microservicios.Msvcproducto.model.repo;


import com.bdv.microservicios.Msvcproducto.model.entities.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductoRepo extends JpaRepository<Producto,String> {

    @Procedure
    void sp_ACCOUNT(@Param("Accion") String Accion,
                            @Param("sProducto") String sProducto,
                            @Param("sTitularId") String sTitularId,
                            @Param("sSucursal") String sSucursal,
                            @Param("iTCuenta") Integer iTCuenta,
                            @Param("iTTitular") Integer iTTtitular,
                            @Param("iTRegla") Integer iTRegla,
                            @Param("sRepresentante") String sRepresentante,
                            @Param("Observacion") String Observacion,
                            @Param("sUser") String sUser
                            );

}
















