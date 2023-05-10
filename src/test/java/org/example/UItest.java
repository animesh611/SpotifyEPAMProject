package org.example;

import com.browser.BrowserParameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UItest {
    @Test
    public void UITest() throws InterruptedException{
        WebDriver driver= BrowserParameter.setupBrowser("chrome","https://open.spotify.com/");
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