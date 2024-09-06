/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Mostrar el formulario de login
function showLogin() {
    document.getElementById('login-form').classList.add('active');
    document.getElementById('signup-form').classList.remove('active');
}

// Mostrar el formulario de sign up
function showSignUp() {
    document.getElementById('signup-form').classList.add('active');
    document.getElementById('login-form').classList.remove('active');
}
