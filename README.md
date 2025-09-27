<div align="center" id="toc">
  <a href="https://github.com/Flummidill/SimpleBan/releases">
    <img src="https://github.com/Flummidill/SimpleBan/blob/1.0.0/icons/SimpleBan-250x250.png?raw=true" alt="SimpleBan-Icon">
  </a>

  <ul style="list-style: none">
    <summary>
      <h1>SimpleBan</h1>
    </summary>
  </ul>
  
  <a href="https://github.com/Flummidill/SimpleBan/releases">
    <img src="https://img.shields.io/github/downloads/Flummidill/SimpleBan/v1.0.0/SimpleBan-1.0.0.jar?style=for-the-badge&label=Downloads&color=29A100"</img>
  </a>

  <hr/>
</div>

## ✨ Features
- **Temporary and Permanent Bans**  
  Handle rule-breakers effectively by issuing either timed bans or permanent bans. This keeps your community fair and under control.  

- **Detailed Ban Information**  
  View when, why, and by whom a player was banned. Helps admins stay organized and consistent in their moderation.  

- **Ban List Overview**  
  Get a quick overview of all currently banned players, so nothing slips through the cracks.  

- **Announcements & Transparency**  
  Choose who sees ban announcements, letting you balance between admin privacy and public transparency.  

- **Timezone & Date Customization**  
  Show bans in your preferred timezone and date format, ensuring clarity across different staff members.  

- **Granular Permission System**  
  Assign different levels of moderation power to staff, ensuring only trusted roles can perform sensitive actions like permanent bans.

<hr/>

### Admin Commands:
```
/tempban <player> <duration> [reason] - Temporarily bans a Player
/permban <player> [reason] - Permanently bans a Player
/banlist - View a List of all banned Players
/baninfo <player> - View Information about a banned Player
/unban <player> - Unbans a Player
```

### Permissions:
```
simpleban.admin (Default: false) - Allow use of all SimpleBan Commands
simpleban.tempban (Default: false) - Allow use of the TempBan Command
simpleban.permban (Default: false) - Allow use of the PermBan Command
simpleban.banlist (Default: false) - Allow use of the BanList Command
simpleban.baninfo (Default: false) - Allow use of the BanInfo Command
simpleban.unban (Default: false) - Allow use of the UnBan Command
```

### Config:
```
announce-bans - Set who sees ban Announcements
timezone - Set the Timezone
date-format - Set the Format used for displaying Dates
show-timezone - Set whether the Timezone is shown alongside Dates
```