package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservaBooking {

    public static Target clicCerrarHome = Target
            .the("clic cerrar home")
            .located(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    public static Target clicDestino = Target
            .the("clic Destino")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
    public static Target txtDestino = Target
            .the("Ingresar destino")
            .located(By.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));
    public static Target seleccionarDestino = Target
            .the("Seleccionar destino")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"));
    public static Target clicFecha = Target
            .the("clic en fecha")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
    public static Target clicFechaInicial = Target
            .the("clic en fecha inicial")
            .located(By.xpath("//android.view.View[@content-desc=\"14 February 2023\"]"));
    public static Target clicFechaFinal = Target
            .the("clic en fecha final")
            .located(By.xpath("//android.view.View[@content-desc=\"28 February 2023\"]"));
    public static Target clicAceptarFechas = Target
            .the("clic en aceptar fecha")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button"));
    public static Target clicSeleccionarOpciones = Target
            .the("clic en seleccionar opciones")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView"));
    public static Target clicCantidadDeNino = Target
            .the("clic en cantidad de ninos")
            .located(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]"));
    public static Target clicEdadNino = Target
            .the("clic en edad del nino")
            .located(By.id("android:id/numberpicker_input"));
    public static Target btnOk = Target
            .the("clic en boton ok")
            .located(By.id("android:id/button1"));


}
