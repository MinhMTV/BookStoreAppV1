package com.minhtv.bookstoreapp.data;

import android.provider.BaseColumns;


public final class BookContract {

    private BookContract() {
    }

    public static final class BookEntry implements BaseColumns {

        public final static String TABLE_NAME = "book";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_BOOK_NAME = "name";
        public final static String COLUMN_BOOK_PRICE = "price";
        public final static String COLUMN_BOOK_SECTION = "section";
        public final static String COLUMN_BOOK_QUANTITY = "quantity";
        public final static String COLUMN_BOOK_SUPPLIER = "supplier";
        public final static String COLUMN_BOOK_CONTACT = "contact";

        public final static int QUANTITY_AVAILABLE = 1;
        public final static int QUANTITY_UNAVAILABLE = 0;

        public final static int SECTION_FANTASY = 0;
        public final static int SECTION_KRIMI = 1;
        public final static int SECTION_ROMANCE = 2;
        public final static int SECTION_SCIFI = 3;
        public final static int SECTION_BIO = 4;
        public final static int SECTION_DRAMA = 5;
        public final static int SECTION_HISTORY = 6;
    }
}
