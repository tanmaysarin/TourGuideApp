package com.example.android.delhi_tour_guide;

    public class Attractions {

        /** String resource ID for the name of the attraction */
        private int mAttractionId;

        /** String resource ID for the details of the attraction */
        private int mDetailsId;

        /** Image resource ID for the word */
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        /** Constant value that represents no image was provided for this word */
        private static final int NO_IMAGE_PROVIDED = -1;

        /**
         * Create a new Word object.
         *
         * @param attractionId is the string resource ID for the name of the tourist spot/restraunt/shopping place, etc.)
         * @param detailsId is the string resource Id for the details of the tourist sopt/restraunt/shopping place, etc.
         * @param imageResourceId is the drawable resource ID for the image associated with the word
         */
        public Attractions(int attractionId, int detailsId, int imageResourceId) {
            mAttractionId = attractionId;
            mDetailsId = detailsId;
            mImageResourceId = imageResourceId;
        }

        /**
         * Get the string resource ID for the default translation of the word.
         */
        public int getattractionId() {
            return mAttractionId;
        }

        /**
         * Get the string resource ID for the Miwok translation of the word.
         */
        public int getdetailsId() {
            return mDetailsId;
        }

        /**
         * Return the image resource ID of the word.
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }
    }
