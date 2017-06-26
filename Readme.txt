#######CREATE SERVICE#######POST#
endpoint:/service/update
{   
   "created":"2017-06-20T21:14:09.595+0000",
   "lastModified":"2017-06-20T21:14:09.595+0000",
   "name":"Wymiana opon",
   "description":"Najtañsza w mieœcie wymiana opon!",
   "time":"30min",
   "price":"50zl",
   "user":1
}
#######UPDATE SERVICE#######POST#
endpoint:/service/update
{  
   "id":1,
   "created":"2017-06-20T21:14:09.595+0000",
   "lastModified":"2017-06-20T21:14:09.595+0000",
   "name":"Wymiana opon",
   "description":"Najtañsza w mieœcie wymiana opon!",
   "time":"30min",
   "price":"50zl",
   "user":1
}
#######REMOVE SERVICE#######POST#
endpoint:/service/remove
{  
   "id":1
}
#######GET SERVICE#######GET##
endpoint:/service/get/{id}

#######GET ALL SERVICE#######GET##
endpoint:/service/get/all