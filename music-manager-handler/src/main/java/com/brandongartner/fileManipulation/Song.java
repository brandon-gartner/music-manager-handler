package com.brandongartner.fileManipulation;

import java.nio.file.Path;

/**
 *
 * @author Brandon Gartner
 */
public class Song {
    private Path filePath;
    private String albumName;
    private String songName;
    private String combinedName;
    
    public Song(Path filePath, String albumName, String songName){
        this.filePath = filePath;
        this.albumName = albumName;
        this.songName = songName;
        this.combinedName = albumName + " - " + songName;
    }
    
    /**
     * Combines the album and song name to generate a new combined name.
     * @return The album name combined with the song name.
     */
    private String combineNames(){
        String combinedName = this.albumName + " - " + this.songName;
        return combinedName;
    }
    
    
    /*
    Basic getters and setters
    */
    public Path getFilePath(){
        return this.filePath;
    }
    
    public void setFilePath(Path newFilePath){
        this.filePath = newFilePath;
    }
    
    public String getAlbumName(){
        return this.albumName;
    }
    
    public void setAlbumName(String newAlbumName){
        this.albumName = newAlbumName;
        this.combinedName = combineNames();
    }
    
    public String getSongName(){
        return this.songName;
    }
    
    public void setSongName(String newSongName){
        this.songName = newSongName;
        this.combinedName = combineNames();
    }
    
    public String getCombinedName(){
        return this.combinedName;
    }
}
