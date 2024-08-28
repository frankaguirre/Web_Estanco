/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $("tr #btndelete").click(function () {
        var idp = $(this).parent().find("#idp").val();
        //alert("idp="+idp);
        swal({
            title: "Esta seguro que desea eliminar?",
            text: "Una vez eliminado, podra seguir comprando más productos!",
            icon: "warning",
            buttons: true,
            dangerMode: true
        })
                .then((willDelete) => {
                    if (willDelete) {
                        eliminar(idp);
                        swal("Poof! El articulo ha sido eliminado!", {
                            icon: "success"
                        }).then((willDelete) => {
                            if (willDelete) {
                                parent.location.href = "CtrProducto?accion=Carrito";
                            }
                        });
                    } else {
                        swal("Articulo no eliminado!");
                    }
                });
    });

    function eliminar(idp) {
        var url = "CtrProducto?accion=Delete";
        $.ajax({
            type: 'post',
            url: url,
            data: "idp=" + idp,
            success: function (data, textStatus, jqXHR) {

            }
        });
    }

$("tr #cantidad").click(function (){
        //alert ("Entro en Cantidad!");
        var idp = $(this).parent().find("#idpro").val();
        var Cantidad = $(this).parent().find("#cantidad").val();
        var url = "CtrProducto?accion=ActualizarCantidad";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp=" + idp +"&Cantidad=" + Cantidad,
            success: function (data, textStatus, jqXHR){
                //alert ("Entro en Cantidad!");
                location.href="CtrProducto?accion=Carrito";
            }
        });
    });
});
