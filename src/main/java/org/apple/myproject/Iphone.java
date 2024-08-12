package main.java.org.apple.myproject;

import main.java.org.apple.myproject.interfaces.CellPhone;
import main.java.org.apple.myproject.interfaces.MusicPlayer;
import main.java.org.apple.myproject.interfaces.WebBrowser;

public class Iphone implements MusicPlayer, CellPhone, WebBrowser{

    @Override
    public void displayPage(String url) {
        System.out.println("Mostrando a pagina" + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void refreshPage() {
        System.out.println("'REFRESCANDO' a pagina");
    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void startvoicemail() {
        System.out.println("Iniciando correio de voz");
       
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void selectSong(String song) {
        System.out.println("Tocar a musica" + song);
    }
   
}
