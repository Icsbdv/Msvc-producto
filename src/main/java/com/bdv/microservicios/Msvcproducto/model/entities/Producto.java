package com.bdv.microservicios.Msvcproducto.model.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name="agregarProducto",
                procedureName = "sp_ACCOUNT",
                parameters = {
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="Accion", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sProducto", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sTitularId", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sSucursal", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="iTCuenta", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="iTTitular", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="iTRegla", type=Integer.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sRepresentante", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="Observacion", type=String.class),
                        @StoredProcedureParameter(mode=ParameterMode.IN, name="sUser", type=String.class),

                })
})
public class Producto implements Serializable {

    @Id
    String producto;


    String titularId;


    String sucursal;


    Integer tcuenta;


    Integer ttitular;


    Integer tregla;


    String representante;


    String observacion;


    String user;



}
