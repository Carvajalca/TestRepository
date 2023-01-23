package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ReservaBooking;

public class InformacionReserva implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservaBooking.clicFecha),
                Click.on(ReservaBooking.clicFechaInicial),
                Click.on(ReservaBooking.clicFechaFinal),
                Click.on(ReservaBooking.clicAceptarFechas),
                Click.on(ReservaBooking.clicSeleccionarOpciones),
                Click.on(ReservaBooking.clicCantidadDeNino),
                Click.on(ReservaBooking.clicEdadNino),
                Click.on(ReservaBooking.btnOk)
        );
    }
}
