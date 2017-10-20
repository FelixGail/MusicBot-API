/*
 * JMusicBot
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.bjoernpetersen.jmusicbot.client.model;

import java.util.Objects;
import com.github.bjoernpetersen.jmusicbot.client.model.Song;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * QueueEntry
 */

public class QueueEntry implements Parcelable {
  @SerializedName("song")
  private Song song = null;

  @SerializedName("userName")
  private String userName = null;

  public QueueEntry song(Song song) {
    this.song = song;
    return this;
  }

   /**
   * Get song
   * @return song
  **/
  @ApiModelProperty(required = true, value = "")
  public Song getSong() {
    return song;
  }

  public void setSong(Song song) {
    this.song = song;
  }

  public QueueEntry userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * The user who put the song in the queue
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "The user who put the song in the queue")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueEntry queueEntry = (QueueEntry) o;
    return Objects.equals(this.song, queueEntry.song) &&
        Objects.equals(this.userName, queueEntry.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(song, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueEntry {\n");
    
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(song);

    out.writeValue(userName);
  }

  public QueueEntry() {
    super();
  }

  QueueEntry(Parcel in) {
    
    song = (Song)in.readValue(Song.class.getClassLoader());
    userName = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<QueueEntry> CREATOR = new Parcelable.Creator<QueueEntry>() {
    public QueueEntry createFromParcel(Parcel in) {
      return new QueueEntry(in);
    }
    public QueueEntry[] newArray(int size) {
      return new QueueEntry[size];
    }
  };
}

