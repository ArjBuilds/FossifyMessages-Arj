# Fossify Messages (ArjBuilds Fork)
<img alt="Logo" src="graphics/icon.webp" width="120" />

[![Downloads](https://img.shields.io/github/downloads/ArjBuilds/MessagesFork/total?style=for-the-badge&color=blue)](https://github.com/ArjBuilds/MessagesFork/releases)

**Enhanced fork with Spam Folder Feature** 🚀

This is a personal fork of [Fossify Messages](https://github.com/FossifyOrg/Messages) with additional spam management capabilities.

## ✨ New Features in This Fork

### 📬 **SPAM FOLDER MANAGEMENT**
Take complete control over unwanted messages with a dedicated spam folder:
- **Manual Spam Marking:** Long-press any conversation and mark it as spam
- **Automatic Spam Detection:** Messages from blocked numbers or containing blocked keywords automatically go to spam
- **Review Before Delete:** Spam messages are saved for review, not immediately deleted
- **No Spam Notifications:** Spam messages won't disturb you with notifications
- **Empty Spam Folder:** Bulk delete all spam conversations when ready
- **Unmark Spam:** Easily restore conversations if marked by mistake

**How It Works:**
1. Mark conversations as spam via context menu
2. View spam folder from main menu
3. Blocked numbers/keywords automatically trigger spam detection
4. Review and permanently delete or restore as needed

---

## 📱 Original Fossify Messages Features

Fossify Messages is your trusted messaging companion, designed to enhance your messaging experience in various ways.

**📱 STAY CONNECTED WITH EASE:**  
With Fossify Messages, you can effortlessly send SMS and MMS messages to stay connected with your loved ones. Enjoy SMS/MMS based group messaging and express yourself with photos, emojis, and quick greetings.

**🚫 BLOCK UNWANTED MESSAGES:**  
Take control of your messaging experience with a robust blocking feature, easily preventing unwanted messages, even from unknown contacts. You can also export and import blocked numbers for hassle-free backup. Additionally, customize your experience by preventing messages with specific words or phrases from reaching your inbox.

**🔒 EFFORTLESS SMS BACKUP:**  
Say goodbye to worries about losing important messages. Fossify Messages offers convenient SMS backup functionality by allowing you to export and import your messages. This feature ensures that you can easily switch devices without losing your valuable conversations.

**🚀 LIGHTNING-FAST AND LIGHTWEIGHT:**  
Despite its powerful features, Fossify Messages boasts a remarkably small app size, making it quick and easy to download and install. Experience speed and efficiency while enjoying the peace of mind that comes with SMS backup.

**🔐 ENHANCED PRIVACY:**  
Customize what appears on your lock screen for added privacy. Choose to display only the sender, message content, or nothing at all. Your messages are in your control.

**🔍 EFFICIENT MESSAGE SEARCH:**  
Say goodbye to endless scrolling through conversations. Fossify Messages simplifies message retrieval with a quick and efficient search feature. Find what you need, when you need it.

**🌈 MODERN DESIGN & USER-FRIENDLY INTERFACE:**  
Enjoy a clean, modern design with a user-friendly interface. The app features a material design and a dark theme option, providing a visually appealing and comfortable user experience.

**🌐 OPEN-SOURCE TRANSPARENCY:**  
Your privacy is a top priority. Fossify Messages operates without requiring an internet connection, guaranteeing message security and stability. Our app is completely free of ads and does not request unnecessary permissions. Moreover, it is fully open-source, providing you with peace of mind, as you have access to the source code for security and privacy audits.

---

## 🔧 Technical Details

### Changes in This Fork:
- **Database Migration:** v10 → v11 (adds `is_spam` column)
- **New Activities:** `SpamConversationsActivity` for spam management
- **Automatic Detection:** Integration with existing blocking system
- **UI Updates:** New menus, layouts, and string resources
- **Persistence Fixes:** Proper handling of spam status during sync

### Building from Source:
```bash
git clone https://github.com/ArjBuilds/MessagesFork.git
cd MessagesFork
./gradlew assembleDebug
```

---

## 📥 Download

[Download Latest Release APK](https://github.com/ArjBuilds/MessagesFork/releases)

---

## 🙏 Credits

- **Original App:** [FossifyOrg/Messages](https://github.com/FossifyOrg/Messages)
- **Spam Folder Feature:** ArjBuilds

➡️ Explore more Fossify apps: https://www.fossify.org<br>
➡️ Original Source Code: https://www.github.com/FossifyOrg<br>
➡️ Join the community on Reddit: https://www.reddit.com/r/Fossify<br>
➡️ Connect on Telegram: https://t.me/Fossify

<div align="center">
<img alt="App image" src="fastlane/metadata/android/en-US/images/phoneScreenshots/1_en-US.png" width="30%">
<img alt="App image" src="fastlane/metadata/android/en-US/images/phoneScreenshots/2_en-US.png" width="30%">
<img alt="App image" src="fastlane/metadata/android/en-US/images/phoneScreenshots/3_en-US.png" width="30%">
</div>
