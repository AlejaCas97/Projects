package pageObjects;

import org.openqa.selenium.By;

public class LinioPages {

private static By btnCerrarAnuncio = By.xpath("//div[@class='dy-lb-close']");
private static By btnPorAhoraNo = By.xpath("//button[@id='onesignal-slidedown-cancel-button']");
private static By txtBarraBusqueda =By.xpath("//input[@placeholder='Busca productos'and@class='form-control']");
private static By imgProductoUno = By.xpath("//a[contains(@href,'/p/echo-dot-3-amazon-altavoz-inteligente-con-alexa-negro-n5f9xq?qid')]");
private static By btnMenuHamburguesa = By.xpath("//div[@class='icon icon-hamburger']");
private static By lblRelojes = By.xpath("//span[contains(text(),'Relojes y Accesorios')]");
private static By imgRelojesMujer = By.xpath(("//a[@href='/c/relojes/relojes-mujer'and@class='canvas']"));
private static By imgRelojesMujerCasio = By.xpath("//a[@href='/c/relojes/relojes-mujer/b/casio']");
private static By imgProductoDos= By.xpath("//a[contains(@href,'/p/reloj-retro-a-159-oro-rosa-delgado-liviano-y-elegante-n49p04?qid')]");
private static By lblElectrodomesticos = By.xpath("//a[@href='/cm/productos-internacionales-en-colombia'and text()='Internacional']");
private static By imgProductoTres =By.xpath("//a[contains(@href,'/p/hp-156-amd-ryzen-5-8gb-ram-256gb-ssd-hs-8471300000-lfk5v1?qid')]");
private static By lblProducto = By.xpath("//span[@itemprop='name' and contains(text(),'Ryzen 5 8GB')]");
private static By lblValorProducto = By.xpath("//span[contains(text(),'$2.236.990')]");


    public static By getBtnCerrarAnuncio() { return btnCerrarAnuncio; }

    public static By getBtnPorAhoraNo() { return btnPorAhoraNo; }

    public static By getTxtBarraBusqueda() { return txtBarraBusqueda; }

    public static By getImgProductoUno() { return imgProductoUno; }

    public static By getBtnMenuHamburguesa() { return btnMenuHamburguesa; }

    public static By getLblRelojes() { return lblRelojes; }

    public static By getImgRelojesMujer() { return imgRelojesMujer; }

    public static By getImgRelojesMujerCasio() { return imgRelojesMujerCasio; }

    public static By getImgProductoDos() { return imgProductoDos; }

    public static By getLblElectrodomesticos() { return lblElectrodomesticos; }

    public static By getImgProductoTres() { return imgProductoTres; }

    public static By getLblProducto() { return lblProducto; }

    public static By getLblValorProducto() { return lblValorProducto;}
}
