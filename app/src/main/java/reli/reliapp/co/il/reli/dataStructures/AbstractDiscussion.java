package reli.reliapp.co.il.reli.dataStructures;

import android.graphics.Bitmap;
import android.location.Location;

import com.parse.ParseClassName;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.util.Date;
import java.util.UUID;

import reli.reliapp.co.il.reli.utils.Const;

@ParseClassName("Discussions")
public abstract class AbstractDiscussion extends ParseObject {

    private String discussionName;
    private ParseGeoPoint location;
    private int radius;
    private Bitmap discussionLogo;
    private Date creationDate;
    private Date expirationDate;
    private String ownerParseID;

    /* ========================================================================== */

    // Default constructor is a must
    public AbstractDiscussion() {
    }

    /* ========================================================================== */

    public AbstractDiscussion (String discussionName, ParseGeoPoint location, int radius,
                               Bitmap discussionLogo, Date creationDate, Date expirationDate,
                               String ownerParseID) {
        setDiscussionName(discussionName);
        setLocation(location);
        setRadius(radius);
        setDiscussionLogo(discussionLogo);
        setDiscussionCreationDate(creationDate);
        setDiscussionExpirationDate(expirationDate);
        setOwnerParseID(ownerParseID);

    }

    /* ========================================================================== */

    public String getDiscussionID() {
        return getObjectId();
    }

    /* ========================================================================== */

    public void setDiscussionName(String discussionName) {
        put(Const.COL_DISCUSSION_NAME, discussionName);
    }

    /* ========================================================================== */

    public String getDiscussionName() {
        return getString(Const.COL_DISCUSSION_NAME);
    }

    /* ========================================================================== */

    public void setLocation(ParseGeoPoint location) {
        put(Const.COL_DISCUSSION_LOCATION, location);
    }

    /* ========================================================================== */

    public ParseGeoPoint getLocation() {
        return getParseGeoPoint(Const.COL_DISCUSSION_LOCATION);
    }

    /* ========================================================================== */

    public void setRadius(int radius) {
        put(Const.COL_DISCUSSION_RADIUS, radius);
    }

    /* ========================================================================== */

    public int getRadius() {
        return getInt(Const.COL_DISCUSSION_RADIUS);
    }

    /* ========================================================================== */

    public void setDiscussionLogo(Bitmap discussionLogo) {
        this.discussionLogo = discussionLogo;
    }

    /* ========================================================================== */

    public Bitmap getDiscussionLogo() {
        // TODO
        return this.discussionLogo;
    }

    /* ========================================================================== */

    public void setDiscussionCreationDate(Date creationDate) {
        put(Const.COL_DISCUSSION_CREATION_DATE, creationDate);
    }

    /* ========================================================================== */

    public Date getDiscussionCreationDate() {
        return getDate(Const.COL_DISCUSSION_CREATION_DATE);
    }

    /* ========================================================================== */

    public void setDiscussionExpirationDate(Date expirationDate) {
        put(Const.COL_DISCUSSION_EXPIRATION_DATE, expirationDate);
    }

    /* ========================================================================== */

    public Date getDiscussionExpirationDate() {
        return getDate(Const.COL_DISCUSSION_EXPIRATION_DATE);
    }

    /* ========================================================================== */

    public void setOwnerParseID(String ownerParseID) {
        put(Const.COL_DISCUSSION_OWNER_PARSE_ID, ownerParseID);
    }

    /* ========================================================================== */

    public String getOwnerParseID() {
        return getString(Const.COL_DISCUSSION_OWNER_PARSE_ID);
    }
}

