package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.ReservaBooking;

public class CiudadReserva implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReservaBooking.clicCerrarHome),
                Click.on(ReservaBooking.clicDestino),
                SendKeys.of("cusco").into(ReservaBooking.txtDestino),
                Click.on(ReservaBooking.seleccionarDestino)
                );

    }
}
