# Dnd-Character-Api-Spring-Boot

##Geting Started

I created this application as part of my ongoing project to create an easier way to play DND.

By running this application within Eclispe, it will create a tomcat server. There are currently 5 endpoints on this RESTful API.

###GET "/characters"

This endpoint gets you all characters in the collection, returning them as a JSON object.

###GET "/characters/{id}"

This endpoint gets you the character who matches the character id in the parameters. The character is returned as a JSON object.

###POST "/characters"

This endpoint posts a new character into the character collection. It must pass all requirements beforebeing posted.

###PUT "/characters/{id}"

This endpoint updates the character whose character id matches the parameters.

###DELETE "/characters/{id}"

This endpoint deletes the character whose character id matches the parameters.

##Technologies Used

I used Spring Boot to bootstrap the RESTful API. I used Java version 1.8. I wrote the code using Eclipse.
