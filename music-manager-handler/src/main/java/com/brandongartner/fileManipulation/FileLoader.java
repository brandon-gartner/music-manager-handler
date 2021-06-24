package com.brandongartner.fileManipulation;

import java.util.ArrayList;

/**
 *
 * @author Brandon Gartner
 */
public class FileLoader {
    private ArrayList<Song> songList = new ArrayList<>();
    
    private void sortList(){
        
    }
    
    private void mergeSort(ArrayList<Song> songList, int left, int right){
        
    }
    
    private void merge(ArrayList<Song> songList, int left, int middle, int right){
        
    }
    
    /*
    Basic setters and getters
    */
    
    //TODO: does the arraylist need a setter?
    
    
    //copy getter
    public ArrayList<Song> getSongList(){
        ArrayList<Song> copiedSongList = new ArrayList<>();
        for (Song s : songList){
            copiedSongList.add(s);
        }
        return copiedSongList;
    }
    
}
