/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const formulario = document.getElementById('formulario');
const inputs = document.querySelectorAll('#formulario input');
const expreciones ={
    identificacion: /^\d{7,10}$/,
    correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+\.[a-zA-Z0-9-.]+$/,
    nombre: /^[a-zA-Z\s]{3,40}$/,
    apellido: /^[a-zA-Z\s]{3,40}$/,
    direccion: /^[a-zA-Z0-9\-\_\#\s]{4,40}$/,
    telefono: /^[0-9]{10}$/,
    usuario: /^[a-zA-Z0-9]{4,20}$/,
    contrasena: /^[a-zA-Z0-9]{6,20}$/
};
const campos = {
    identificacion: true,
    correo: true,
    nombre: true,
    apellido: true,
    direccion: true,
    telefono: true,
    usuario: true,
    contrasena: true,
    contrasena2: true
};
const validarformulario = (e) =>{
    switch (e.target.name){
        case "id":
            validarcampo(expreciones.identificacion, e.target, 'identificacion');
        break;
        case "correo":
            validarcampo(expreciones.correo, e.target, 'correo');
        break;
        case "nombre":
            validarcampo(expreciones.nombre, e.target, 'nombre');
        break;
        case "apellido":
            validarcampo(expreciones.apellido, e.target, 'apellido');
        break;
        case "direccion":
            validarcampo(expreciones.direccion, e.target, 'direccion');
        break;
        case "telefono":
            validarcampo(expreciones.telefono, e.target, 'telefono');
        break;
        case "usuario":
            validarcampo(expreciones.usuario, e.target, 'usuario');
        break;
        case "contrasena":
            validarcampo(expreciones.contrasena, e.target, 'contrasena');
            validarcontrasena2();
            break;
        case "contrasena2":
            validarcontrasena2();
        break;
    }
};
const validarcampo = (expresion, input, campo)=>{
 if (expresion.test(input.value)){
     document.getElementById(`grupo_${campo}`).classList.remove('formulario_grupo-incorrecto');
     document.getElementById(`grupo_${campo}`).classList.add('formulario_grupo-correcto');
     document.querySelector(`#grupo_${campo} i`).classList.add('bi-check-circle');
     document.querySelector(`#grupo_${campo} i`).classList.remove('bi-x-circle-fill');
     document.querySelector(`#grupo_${campo} .formulario_input-error`).classList.remove('formulario_input-error-activo');
     campos[campo]= true;
 } else{
        document.getElementById(`grupo_${campo}`).classList.add('formulario_grupo-incorrecto');
        document.getElementById(`grupo_${campo}`).classList.remove('formulario_grupo-correcto');
        document.querySelector(`#grupo_${campo} i`).classList.remove('bi-check-circle');
        document.querySelector(`#grupo_${campo} i`).classList.add('bi-x-circle-fill');
        document.querySelector(`#grupo_${campo} .formulario_input-error`).classList.add('formulario_input-error-activo');
        campos[campo] = false;
    }  
};

const validarcontrasena2 = () =>{
    const inputcontrasena1 = document.getElementById('contrasena');
    const inputcontrasena2 = document.getElementById('contrasena2');
    if (inputcontrasena1.value !== inputcontrasena2.value){
     document.getElementById(`grupo_contrasena2`).classList.add('formulario_grupo-incorrecto');
     document.getElementById(`grupo_contrasena2`).classList.remove('formulario_grupo-correcto');
     document.querySelector(`#grupo_contrasena2 i`).classList.remove('bi-check-circle');
     document.querySelector(`#grupo_contrasena2 i`).classList.add('bi-x-circle-fill');
     document.querySelector(`#grupo_contrasena2 .formulario_input-error`) .classList.add('formulario_input-error-activo');
     campos['contrasena2']= false;
 } else{
     document.getElementById(`grupo_contrasena2`).classList.remove('formulario_grupo-incorrecto');
     document.getElementById(`grupo_contrasena2`).classList.add('formulario_grupo-correcto');
     document.querySelector(`#grupo_contrasena2 i`).classList.add('bi-check-circle');
     document.querySelector(`#grupo_contrasena2 i`).classList.remove('bi-x-circle-fill');
     document.querySelector(`#grupo_contrasena2 .formulario_input-error`) .classList.remove('formulario_input-error-activo');
     campos['contrasena2']= true;
    } 
};

inputs.forEach((input) =>{
    input.addEventListener('keyup', validarformulario);
    input.addEventListener('blur', validarformulario);
});

formulario.addEventListener('submit', (e) =>{
    const terminos = document.getElementById('terminos');
    if (campos.identificacion && campos.nombre && campos.apellido && campos.direccion && campos.telefono && campos.usuario && campos.contrasena && contrasena2 && terminos.checked){
        
    }else{
        e.preventDefault();
        document.getElementById('formulario_mensaje').classList.add('formulario_mensaje-activo');
    }
});
