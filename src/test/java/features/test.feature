Feature: Registrarse en efset.org
  Como usuario quiero registrarme en la pagina de efset

  Background:
    Given estoy en la página principal de efset.org
    And tengo internet
    And quiero crear una cuenta en "efset.org"

  Scenario: Registrar una cuenta en "efset.org"
    Given estoy en la página principal de efset.org
    When doy click en el botón de "Login"
    And soy redireccionado a una página donde tengo que ingresar unos datos
    And ingreso un email en la barra de texto de "Email"
    And ingreso una contraseña en la barra de "Password"
    When doy click en el boton de "SIGN IN"
    And soy redireccionado a la pagina principal de efset.org
    Then en donde previamente estaba el boton de "Login" aparece un avatar de una persona con un menu desplegable

  Scenario: Cancelar suscripcion de email
    Given estoy en la página principal de efset.org
    When doy click en el boton del footer "Cookies"
    And soy redireccionado a cookie-policy
    When doy click en el boton de "Cancelar Suscripcion"
    And ingreso mi email en la barra de texto para "Email"
    When doy click en el boton de "recaptcha-button"
    When doy click en el boton de "Enviar"
    And soy redireccionado a la pagina de "unsuscribe"
