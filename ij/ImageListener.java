package ij;

public interface ImageListener {

	public void imageOpened(ImagePlus imp);

	public void imageClosed(ImagePlus imp);

	public void imageUpdated(ImagePlus imp);

}
