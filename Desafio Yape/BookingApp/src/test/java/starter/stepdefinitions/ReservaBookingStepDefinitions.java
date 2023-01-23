package starter.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.tasks.CiudadReserva;
import starter.tasks.InformacionReserva;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ReservaBookingStepDefinitions {

    //@Managed(driver = "Appium")
    //public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^Que se requiere realizar la busqueda de alojamiento desde la app de Booking$")
    public void queSeRequiereRealizarLaBusquedaDeAlojamientoDesdeLaAppDeBooking() {
        theActorCalled("Carlos").attemptsTo(
                new CiudadReserva()
        );
    }

    @Cuando("^Se complete la informacion de ciudad, fechas, cantidad de personas$")
    public void seCompleteLaInformacionDeCiudadFechasCantidadDePersonas() {
        theActorInTheSpotlight().attemptsTo(
                new InformacionReserva()
        );

    }

    @Cuando("^se seleccione el alojamiento$")
    public void seSeleccioneElAlojamiento() {
        //No fue posible continuar con la automatizacion, falla de la app (revisar evidencias)
    }

    @Entonces("^se debe completar la informacion y generar la reserva exitosa$")
    public void seDebeCompletarLaInformacionYGenerarLaReservaExitosa() {
        //No fue posible continuar con la automatizacion, falla de la app (revisar evidencias)

    }
}
