var http = require("http");
var url = require("url");
var fs = require('fs');
count = 0;
http.createServer(function(request, response){
    var url_parameters = url.parse(request.url,true);
    var path =   url_parameters.pathname;
    var file = path.substring(1);
	//console.log(request.url !== '/favicon.ico');
	if (request.url !== '/favicon.ico') 
    {	
		count++;
	}
	
    fs.writeFile('count.txt', '<h1>Visit Count : '+count+'</h1>', function (error) {
        if(error) 
            return console.log(error);
    });

    fs.readFile(file, function(error, data){
        if(!error){
            //count++;
            response.writeHead(200, {'Content-Type':'text/html'});
            response.write(data.toString());
            response.end();           
        }
        else {
            response.writeHead(200, {'Content-Type':'text/html'});
            response.write("<h1> Resource Not Found..!! </h1>");
            response.end();
        }
    });
}).listen(9000);
console.log("Sever started on port:9000");