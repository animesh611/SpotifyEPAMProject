package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ResourceBundle;

public class SpotifyPageObject {

    WebDriver driver;
    public SpotifyPageObject(WebDriver driver){
        this.driver=driver;
    }
    ResourceBundle r=ResourceBundle.getBundle("config");
    String username=r.getString("username");
    String password=r.getString("password");

    By loginButton= By.xpath("//span[contains(text(),'Log in')]");
    By usernameField=By.xpath("//input[@id='login-username']");
    By passwordField=By.xpath("//input[@id='login-password']");
    By loginClick=By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']");
    By createPlaylistButton=By.xpath("//span[contains(text(),'Create playlist')]");
    By clickOnPlaylist=By.xpath("//body/div[@id='main']/div[1]/div[2]/nav[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/li[1]/div[1]/button[1]");
    By clickOnThreeDots=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]");
    By clickOnEditDetails=By.xpath("//span[contains(text(),'Edit details')]");
    By playlistName=By.xpath("//body[1]/div[16]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]");
    By clickSave=By.xpath("//span[contains(text(),'Save')]");
    By searchSongName=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[3]/section[1]/div[1]/div[1]/input[1]");
    By addButton=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]");
    By crossButton=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[3]/section[1]/button[1]/*[1]");
    By playButton=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
    By pauseButton=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]");
    By clickOnSong=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/button[2]/*[1]");
    By removeSong=By.xpath("//span[contains(text(),'Remove from this playlist')]");
    By playlistOption=By.xpath("//body/div[@id='main']/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/main[1]/div[1]/section[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]");
    By delete=By.xpath("//span[contains(text(),'Delete')]");
    By deleteConfirm=By.xpath("//span[contains(text(),'Delete')]");

    public void login() throws InterruptedException {
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(loginClick).click();
        Thread.sleep(8000);
    }
    public void createPlaylist() throws InterruptedException {
        driver.findElement(createPlaylistButton).click();
        Thread.sleep(5000);
    }
    public void editPlaylistDetails() throws InterruptedException {
        driver.findElement(clickOnPlaylist).click();
        Thread.sleep(2000);
        driver.findElement(clickOnThreeDots).click();
        Thread.sleep(2000);
        driver.findElement(clickOnEditDetails).click();
        Thread.sleep(2000);

        WebElement nameInput2 = driver.findElement(playlistName);
        nameInput2.clear();
        Thread.sleep(500);
        nameInput2.sendKeys("Test Playlist");
        driver.findElement(clickSave).click();
        Thread.sleep(2000);
    }
    public void searchSong(String song) throws InterruptedException {
        driver.findElement(searchSongName).sendKeys(song);
        Thread.sleep(2000);
    }
    public void addSongToPlaylist() throws InterruptedException {
        driver.findElement(addButton).click();
        Thread.sleep(1000);
        driver.findElement(crossButton).click();
        Thread.sleep(500);
    }
    public void playSong() throws InterruptedException {
        driver.findElement(playButton).click();
        Thread.sleep(20000);
    }
    public void pauseSong() throws InterruptedException {
        driver.findElement(pauseButton).click();
        Thread.sleep(1000);
    }
    public void removeSongFromPlaylist() throws InterruptedException {
        driver.findElement(clickOnSong).click();
        Thread.sleep(2000);
        driver.findElement(removeSong).click();
        Thread.sleep(1000);
    }
    public void deletePlaylist() throws InterruptedException {
        driver.findElement(playlistOption).click();
        Thread.sleep(1000);
        driver.findElement(delete).click();
        Thread.sleep(1000);
        driver.findElement(deleteConfirm).click();
        Thread.sleep(1000);
    }
}
