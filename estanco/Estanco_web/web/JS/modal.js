/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



      


$(document).ready(function () {
    $("tr #btneditar").click(function () {
        var id = $(this).parent().find("#id").val();
        alert("entro en editar id= "+id);
        //var myModal = new bootstrap.Modal(document.getElementById('#editarproducto'));
        //myModal.show();
       $('#editarproducto').modal('show'); 
    });

    
});

