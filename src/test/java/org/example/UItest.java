package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class UItest {
    ChromeDriver driver = new ChromeDriver();

    @Test
    public void UItest() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver.get("https://open.spotify.com/");
        driver.manage().window().maximize();

        SpotifyPageObject spo=new SpotifyPageObject(driver);

        spo.login();
        spo.createPlaylist();
        spo.editPlaylistDetails();
        spo.searchSong("Ram Siya Ram");
        spo.addSongToPlaylist();
        spo.playSong();
        spo.pauseSong();
        spo.removeSongFromPlaylist();
        spo.deletePlaylist();
        driver.manage().deleteAllCookies();
    }
}