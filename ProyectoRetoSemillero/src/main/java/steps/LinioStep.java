package steps;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Excel;
import pageObjects.LinioPages;
import static org.junit.Assert.assertEquals;

public class LinioStep {

    public void darClick(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }
    WebDriver driver = new ChromeDriver();

    @Step
    public void esperarYCerrarAnuncios(){
        try {
            Thread.sleep(40000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        darClick(LinioPages.getBtnPorAhoraNo());
        //Activarlo si aparece el segundo anuncio
        //darClick(LinioPages.getBtnCerrarAnuncio());
    }

    public void escribirYDarEnter(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();

    @Step
    public void buscar() {

        darClick(LinioPages.getTxtBarraBusqueda());
        try {
            leerExcel = Excel.leerXlsx("LinioBusqueda.xlsx", "HojaBusq");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < leerExcel.size(); i++) {
            escribirYDarEnter(LinioPages.getTxtBarraBusqueda(), leerExcel.get(i).get("Consultas"));
        }
    }

    public void esperar(){
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void seleccionarPrimerProducto(){
        esperar();
        darClick(LinioPages.getImgProductoUno());
    }
    @Step
    public void seleecionarSegundoProducto(){
        esperar();
        darClick(LinioPages.getBtnMenuHamburguesa());
        esperar();
        darClick(LinioPages.getLblRelojes());
        esperar();
        darClick(LinioPages.getImgRelojesMujer());
        esperar();
        darClick(LinioPages.getImgRelojesMujerCasio());
        esperar();
        darClick(LinioPages.getImgProductoDos());
    }
    @Step
    public void BuscarYValidarTercerProducto() throws AWTException {
        esperar();
        darClick(LinioPages.getLblElectrodomesticos());
        esperar();
        //Scroll
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        esperar();
        darClick(LinioPages.getImgProductoTres());
    }

    private String obtenerTexto(By elemento){
        return  SeleniumWebDriver.driver.findElement(elemento).getText();
    }

    public void validar(By elemento, String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }
}
