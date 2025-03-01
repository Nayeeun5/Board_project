enum ResponseCode{
    SUCCESS = "SU",

    VALIDATION_FAILED = "VF",
    DUPLICATE_EMAIL = "DE",
    DUPLICATE_NICKNAME = "DN",
    DUPLICATE_TEL_NUMBER = "DT",
    NOT_EXISTED_USER = "NU",
    NOT_EXISTED_BOARD = "NB",

    SIGN_IN_FAIL = "SF",
    AUTHORIZATION_FAIL = "AF",

    NO_PERMISSION = "NP",

    DATABASE_ERROR = "DBE",
}
export default ResponseCode;