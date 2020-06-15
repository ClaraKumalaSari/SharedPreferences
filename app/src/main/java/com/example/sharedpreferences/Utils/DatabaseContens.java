package com.example.sharedpreferences.Utils;

public enum  DatabaseContens {

        DATABASE("loginsederhana.db"),
        TABLE_USERS("tbl_users");

        private String name;

        /**
         * Constructs DatabaseContents.
         * @param name name of this content for using in database.
         */
        private DatabaseContens(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

