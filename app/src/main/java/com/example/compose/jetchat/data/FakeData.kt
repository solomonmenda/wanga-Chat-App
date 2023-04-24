/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.compose.jetchat.data

import com.example.compose.jetchat.R
import com.example.compose.jetchat.conversation.ConversationUiState
import com.example.compose.jetchat.conversation.Message
import com.example.compose.jetchat.data.EMOJIS.EMOJI_CLOUDS
import com.example.compose.jetchat.data.EMOJIS.EMOJI_FLAMINGO
import com.example.compose.jetchat.data.EMOJIS.EMOJI_MELTING
import com.example.compose.jetchat.data.EMOJIS.EMOJI_PINK_HEART
import com.example.compose.jetchat.data.EMOJIS.EMOJI_POINTS
import com.example.compose.jetchat.profile.ProfileScreenState

private val initialMessages = listOf(
    Message(
        "me",
        "umepotelea wapi!",
        "8:07 PM"
    ),
    Message(
        "Bukosia Prudence",
        "Uko mbele msee!$EMOJI_PINK_HEART",
        "8:06 PM",

    ),
    Message(
        "Akinyi Irene",
        "Yap niko module 8 pathway 2",
        "8:05 PM"
    ),
    Message(
        "Bukosia Prudence",
        "Ulimaliza Module zote",
        "8:05 PM"
    ),
    Message(
        "Akinyi Irene",
        "Poa android training iko juu",
        "8:04 PM"
    ),
    Message(
        "me",
        "Niaje Wasee",
        "8:03 PM"
    )
)

val exampleUiState = ConversationUiState(
    initialMessages = initialMessages,
    channelName = "#wanga GDSC",
    channelMembers = 4
)

/**
 * Example colleague profile
 */
val colleagueProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.someone_else,
    name = "Akinyi Irene",
    status = "Away",
    displayName = "Irene",
    position = "Android Dev at Wanga",
    twitter = "twitter.com/Akinyii",
    timeZone = "12:25 AM local time (EAT)",
    commonChannels = "2"
)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.ali,
    name = "Lumbasi Justus",
    status = "Online",
    displayName = "Justus",
    position = "Wanga TVC GDSC Lead",
    twitter = "twitter.com/lumbasijustus",
    timeZone = "12:25 AM local time (EAT)",
    commonChannels = null
)

object EMOJIS {
    // EMOJI 15
    const val EMOJI_PINK_HEART = "\uD83E\uDE77"

    // EMOJI 14 🫠
    const val EMOJI_MELTING = "\uD83E\uDEE0"

    // ANDROID 13.1 😶‍🌫️
    const val EMOJI_CLOUDS = "\uD83D\uDE36\u200D\uD83C\uDF2B️"

    // ANDROID 12.0 🦩
    const val EMOJI_FLAMINGO = "\uD83E\uDDA9"

    // ANDROID 12.0  👉
    const val EMOJI_POINTS = " \uD83D\uDC49"
}
