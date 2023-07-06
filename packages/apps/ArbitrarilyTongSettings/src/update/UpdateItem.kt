package win.arbitrarilytong.settings.update

import android.content.Context
import android.text.format.Formatter
import win.arbitrarilytong.settings.R

class UpdateItem(
    context: Context,
    titleItem: String,
    versionItem: String,
    dateItem: String,
    sizeItem: Long,
    extraTitle: String,
    extraItem: String,
    descItem: String,
    urlItem: String
) {
    val updateTitle = titleItem
    val updateVersion = context.getString(R.string.update_version, versionItem)
    val updateSize: String = Formatter.formatFileSize(context, sizeItem)
    val updateDate = dateItem
    val updateExtra = context.getString(R.string.update_extra, extraTitle, extraItem)
    val updateDesc = if (descItem.isNotEmpty()) {
        context.getString(R.string.update_desc, descItem)
    } else {
        context.getString(R.string.update_desc_none)
    }
    val updateUrl = urlItem
}


