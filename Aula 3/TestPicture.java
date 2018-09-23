public class TestPicture {
    public static void main(String[] args) {
	Picture p = LibPicture.load("./input.png");	
	Picture q = LibPicture.flipHorizontal(LibPicture.greyScale(p));
	LibPicture.save(q, "./output.png");	
    }
}
