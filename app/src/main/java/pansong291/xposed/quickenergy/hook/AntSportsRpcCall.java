package pansong291.xposed.quickenergy.hook;

public class AntSportsRpcCall {
        private static final String chInfo = "ch_appcenter__chsub_9patch",
                        timeZone = "Asia\\/Shanghai", version = "3.0.1.2", alipayAppVersion = "0.0.852";

        public static String queryCoinBubbleModule() {
                return RpcUtil.request("com.alipay.sportshealth.biz.rpc.sportsHealthHomeRpc.queryCoinBubbleModule",
                                "[{\"bubbleId\":\"\",\"canAddHome\":false,\"chInfo\":\"" + chInfo
                                                + "\",\"clientAuthStatus\":\"not_support\",\"clientOS\":\"android\",\"distributionChannel\":\"\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_AI\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"]}]");
        }

        public static String receiveCoinAsset(String assetId, int coinAmount) {
                return RpcUtil.request("com.alipay.sportshealth.biz.rpc.SportsHealthCoinCenterRpc.receiveCoinAsset",
                                "[{\"assetId\":\"" + assetId
                                                + "\",\"chInfo\":\"" + chInfo
                                                + "\",\"clientOS\":\"android\",\"coinAmount\":"
                                                + coinAmount
                                                + ",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"tracertPos\":\"首页金币收集\"}]");
        }

        public static String queryMyHomePage() {
                return RpcUtil.request("alipay.antsports.walk.map.queryMyHomePage", "[{\"alipayAppVersion\":\""
                                + alipayAppVersion + "\",\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"pathListUsePage\":true,\"timeZone\":\""
                                + timeZone + "\"}]");
        }

        public static String join(String pathId) {
                return RpcUtil.request("alipay.antsports.walk.map.join", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"pathId\":\""
                                + pathId + "\"}]");
        }

        public static String openAndJoinFirst() {
                return RpcUtil.request("alipay.antsports.walk.user.openAndJoinFirst", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"]}]");
        }

        public static String go(String day, String rankCacheKey, int stepCount) {
                return RpcUtil.request("alipay.antsports.walk.map.go", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"day\":\"" + day
                                + "\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"needAllBox\":true,\"rankCacheKey\":\""
                                + chInfo + "\",\"timeZone\":\"" + timeZone + "\",\"useStepCount\":" + stepCount + "}]");
        }

        public static String openTreasureBox(String boxNo, String userId) {
                return RpcUtil.request("alipay.antsports.walk.treasureBox.openTreasureBox", "[{\"boxNo\":\"" + boxNo
                                + "\",\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"userId\":\""
                                + userId + "\"}]");
        }

        public static String queryProjectList(int index) {
                return RpcUtil.request("alipay.antsports.walk.charity.queryProjectList", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"index\":"
                                + index + ",\"projectListUseVertical\":true}]");
        }

        public static String donate(int donateCharityCoin, String projectId) {
                return RpcUtil.request("alipay.antsports.walk.charity.donate", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"donateCharityCoin\":" + donateCharityCoin
                                + ",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"projectId\":\""
                                + projectId + "\"}]");
        }

        public static String queryWalkStep() {
                return RpcUtil.request("alipay.antsports.walk.user.queryWalkStep", "[{\"chInfo\":\"" + chInfo
                                + "\",\"clientOS\":\"android\",\"features\":[\"DAILY_STEPS_RANK_V2\",\"STEP_BATTLE\",\"CLUB_HOME_CARD\",\"NEW_HOME_PAGE_STATIC\",\"CLOUD_SDK_AUTH\",\"STAY_ON_COMPLETE\",\"EXTRA_TREASURE_BOX\",\"NEW_HOME_PAGE_STATIC\",\"SUPPORT_TAB3\",\"SUPPORT_FLYRABBIT\",\"PROP\",\"PROPV2\",\"ASIAN_GAMES\"],\"timeZone\":\""
                                + timeZone + "\"}]");
        }

        public static String walkDonateSignInfo(int count) {
                return RpcUtil.request("alipay.charity.mobile.donate.walk.walkDonateSignInfo",
                                "[{\"needDonateAction\":false,\"source\":\"walkDonateHome\",\"steps\":" + count
                                                + ",\"timezoneId\":\""
                                                + timeZone + "\"}]");
        }

        public static String donateWalkHome(int count) {
                return RpcUtil.request("alipay.charity.mobile.donate.walk.home",
                                "[{\"module\":\"3\",\"steps\":" + count + ",\"timezoneId\":\"" + timeZone + "\"}]");
        }

        public static String exchange(String actId, int count, String donateToken) {
                return RpcUtil.request("alipay.charity.mobile.donate.walk.exchange",
                                "[{\"actId\":\"" + actId + "\",\"count\":"
                                                + count + ",\"donateToken\":\"" + donateToken + "\",\"timezoneId\":\""
                                                + timeZone + "\",\"ver\":0}]");
        }

        /* 这个好像没用 */
        public static String exchangeSuccess(String exchangeId) {
                String args1 = "[{\"exchangeId\":\"" + exchangeId
                                + "\",\"timezone\":\"GMT+08:00\",\"version\":\"" + version + "\"}]";
                return RpcUtil.request("alipay.charity.mobile.donate.exchange.success", args1);
        }
}
