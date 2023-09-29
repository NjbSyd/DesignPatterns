package GangOfFour.Facade.MediaLibrary;

import GangOfFour.Facade.MediaLibrary.Facade.VideoConversionFacade;

import java.io.File;

public class MediaLibraryFacade_Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}