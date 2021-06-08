public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double area = width * height;
        double numberOfBucketsWithoutExtra = (area / areaPerBucket);
        int bucketsNeeded = (int) Math.ceil(numberOfBucketsWithoutExtra) - extraBucket;
        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double numberOfBucketsWithoutExtra = (area / areaPerBucket);
        int bucketsNeeded = (int) Math.ceil(numberOfBucketsWithoutExtra);
        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBucketsWithoutExtra = (area / areaPerBucket);
        int bucketsNeeded = (int) Math.ceil(numberOfBucketsWithoutExtra);
        return bucketsNeeded;

    }
}
