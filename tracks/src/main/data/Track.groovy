package data

import groovy.transform.ToString

import java.util.logging.Handler
import java.util.logging.Logger

import org.apache.commons.io.FileUtils
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.FieldKey
import org.jaudiotagger.tag.Tag

@ToString
class Track {
	File file
	String title
	String artist
	String album


	static List<Track> getTracks(File dir){
		def tracks = []
		Collection<File> files = FileUtils.listFiles(dir, ['mp3'] as String[], true);
		for (File file : files){
			System.out.println("file:" + file);
			tracks << new Track(file)
		}
		println tracks
		tracks
	}

	Track(File file){
		this.file = file
		try{
			MP3File mp3File = new MP3File(file)
			Tag tag = mp3File.getTag();
			if (tag){
				this.title = tag.getFirst(FieldKey.TITLE);
				this.artist = tag.getFirst(FieldKey.ARTIST);
				//			this.albumArtist = tag.getFirst(FieldKey.ALBUM_ARTIST);
				this.album = tag.getFirst(FieldKey.ALBUM);
			}
		}
		catch (InvalidAudioFrameException e) {
			e.printStackTrace()
		}
	}

	static {
		// disable java logging
		Logger globalLogger = Logger.getLogger("");
		Handler[] handlers = globalLogger.getHandlers();
		for (Handler handler : handlers) {
			globalLogger.removeHandler(handler);
		}
	}
}
