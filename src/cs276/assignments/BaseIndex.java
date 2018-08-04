package cs276.assignments;

import java.nio.channels.FileChannel;

public interface BaseIndex {
	
	public static final int INT_SIZE = Integer.SIZE / Byte.SIZE;
	
	public PostingList readPosting (FileChannel fc) throws Throwable;
	
	public void writePosting (FileChannel fc, PostingList p) throws Throwable;
}
