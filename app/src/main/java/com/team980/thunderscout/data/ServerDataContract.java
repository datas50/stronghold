package com.team980.thunderscout.data;

import android.provider.BaseColumns;

public final class ServerDataContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ServerDataContract() {
    }

    /* Inner class that defines the table contents */
    public static abstract class ScoutDataTable implements BaseColumns {
        public static final String TABLE_NAME = "server_data";
        public static final String COLUMN_NAME_TEAM_NUMBER = "team";
        public static final String COLUMN_NAME_DATE_ADDED = "date_added";

        public static final String COLUMN_NAME_AUTO_CROSSING_STATS = "auto_crossing_stats";
        public static final String COLUMN_NAME_AUTO_DEFENSE_CROSSED = "auto_defense_crossed";
        public static final String COLUMN_NAME_AUTO_SCORING_STATS = "auto_scoring_stats";

        public static final String COLUMN_NAME_TELEOP_DEFENSES_BREACHED = "teleop_defenses_breached";
        public static final String COLUMN_NAME_TELEOP_LIST_DEFENSES_BREACHED = "teleop_list_defenses_breached";
        public static final String COLUMN_NAME_TELEOP_GOALS_SCORED = "teleop_goals_scored";
        public static final String COLUMN_NAME_TELEOP_LOW_GOALS = "teleop_low_goals";
        public static final String COLUMN_NAME_TELEOP_HIGH_GOALS = "teleop_high_goals";
        public static final String COLUMN_NAME_TELEOP_DRIVER_SKILL = "teleop_driver_skill";
        public static final String COLUMN_NAME_TELEOP_COMMENTS = "teleop_comments";
    }
}
