<div align="center">
  <img src="https://github.com/Flummidill/SimpleBan/blob/HEAD/icons/SimpleBan-250x250.png?raw=true" alt="SimpleBan-Icon">
  
  <h1>SimpleBan</h1>
  
  <a href="https://modrinth.com/plugin/simple_ban/versions">
    <img src="https://img.shields.io/modrinth/dt/simple_ban?style=for-the-badge&label=Downloads&color=29A100">
  </a>
</div>


## 🎯 Features

- **Temporary and Permanent Bans**  
Handle rule-breakers effectively by issuing either timed bans or permanent bans. This keeps your community fair and under control.    

- **Ban List Overview**  
Get a quick overview of all currently banned Players, so nothing slips through the cracks.  

- **Announce Bans**  
Choose who sees ban Announcements, letting you balance between Admin- and Public-Transparency.  

- **Timezone & Date Customization**  
Show bans in your preferred timezone and Date format, ensuring clarity across different Staff members.  


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
