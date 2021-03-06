package com.tom.chat

data class Chatrooms(
    val error_code: String,
    val error_text: String,
    val result: Result
)

data class Result(
    val lightyear_list: List<Lightyear>,
    val stream_list: List<Stream>
)

data class Lightyear(
    val background_image: String,
    val charge: Int,
    val closed_at: Int,
    val deleted_at: Int,
    val game: String,
    val group_id: Int,
    val head_photo: String,
    val nickname: String,
    val online_num: Int,
    val open_at: Int,
    val open_attention: Boolean,
    val open_guardians: Boolean,
    val start_time: Int,
    val status: Int,
    val stream_id: Int,
    val stream_title: String,
    val streamer_id: Int,
    val tags: String
)

data class Stream(
    val background_image: String,
    val charge: Int,
    val closed_at: Int,
    val deleted_at: Int,
    val game: String,
    val group_id: Int,
    val head_photo: String,
    val nickname: String,
    val online_num: Int,
    val open_at: Int,
    val open_attention: Boolean,
    val open_guardians: Boolean,
    val start_time: Int,
    val status: Int,
    val stream_id: Int,
    val stream_title: String,
    val streamer_id: Int,
    val tags: String
)