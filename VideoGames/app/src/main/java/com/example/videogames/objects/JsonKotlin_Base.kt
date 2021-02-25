import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2021 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class JsonKotlin_Base (

	@SerializedName("id") val id : Int,
	@SerializedName("slug") val slug : String,
	@SerializedName("name") val name : String,
	@SerializedName("name_original") val name_original : String,
	@SerializedName("description") val description : String,
	@SerializedName("metacritic") val metacritic : Int,
	@SerializedName("metacritic_platforms") val metacritic_platforms : List<Metacritic_platforms>,
	@SerializedName("released") val released : String,
	@SerializedName("tba") val tba : Boolean,
	@SerializedName("updated") val updated : String,
	@SerializedName("background_image") val background_image : String,
	@SerializedName("background_image_additional") val background_image_additional : String,
	@SerializedName("website") val website : String,
	@SerializedName("rating") val rating : Double,
	@SerializedName("rating_top") val rating_top : Int,
	@SerializedName("ratings") val ratings : List<Ratings>,
	@SerializedName("reactions") val reactions : Reactions,
	@SerializedName("added") val added : Int,
	@SerializedName("added_by_status") val added_by_status : Added_by_status,
	@SerializedName("playtime") val playtime : Int,
	@SerializedName("screenshots_count") val screenshots_count : Int,
	@SerializedName("movies_count") val movies_count : Int,
	@SerializedName("creators_count") val creators_count : Int,
	@SerializedName("achievements_count") val achievements_count : Int,
	@SerializedName("parent_achievements_count") val parent_achievements_count : Int,
	@SerializedName("reddit_url") val reddit_url : String,
	@SerializedName("reddit_name") val reddit_name : String,
	@SerializedName("reddit_description") val reddit_description : String,
	@SerializedName("reddit_logo") val reddit_logo : String,
	@SerializedName("reddit_count") val reddit_count : Int,
	@SerializedName("twitch_count") val twitch_count : Int,
	@SerializedName("youtube_count") val youtube_count : Int,
	@SerializedName("reviews_text_count") val reviews_text_count : Int,
	@SerializedName("ratings_count") val ratings_count : Int,
	@SerializedName("suggestions_count") val suggestions_count : Int,
	@SerializedName("alternative_names") val alternative_names : List<String>,
	@SerializedName("metacritic_url") val metacritic_url : String,
	@SerializedName("parents_count") val parents_count : Int,
	@SerializedName("additions_count") val additions_count : Int,
	@SerializedName("game_series_count") val game_series_count : Int,
	@SerializedName("user_game") val user_game : String,
	@SerializedName("reviews_count") val reviews_count : Int,
	@SerializedName("saturated_color") val saturated_color : String,
	@SerializedName("dominant_color") val dominant_color : String,
	@SerializedName("parent_platforms") val parent_platforms : List<Parent_platforms>,
	@SerializedName("platforms") val platforms : List<Platforms>,
	@SerializedName("stores") val stores : List<Stores>,
	@SerializedName("developers") val developers : List<Developers>,
	@SerializedName("genres") val genres : List<Genres>,
	@SerializedName("tags") val tags : List<Tags>,
	@SerializedName("publishers") val publishers : List<Publishers>,
	@SerializedName("esrb_rating") val esrb_rating : Esrb_rating,
	@SerializedName("clip") val clip : Clip,
	@SerializedName("description_raw") val description_raw : String
)