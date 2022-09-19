//Settings for canvas

let canvas;
let ctx;
canvas = document.createElement("canvas");
ctx = canvas.getContext("2d");
canvas.width=400;
canvas.height=700;
document.body.appendChild(canvas);

let spaceImage,spaceshipImage,bulletImage, alienImage,gameOverImage;

//size of the spaceship = 50 * 50;
let spaceshipX = canvas.width/2-25;
let spaceshipY = canvas.height-50;

let bulletList = []  // save bullets here

function Bullet()
{
    this.x = 0;
    this.y = 0;
    this.init=function()
    {
        this.x = spaceshipX + 13;
        this.y = spaceshipY;

        bulletList.push(this);
    };
    this.update = function()
    {
        this.y -= 7;
    };
}

function loadImage()
{
    spaceImage = new Image();
    spaceImage.src="image/space.png";

    spaceshipImage = new Image();
    spaceshipImage.src="image/spaceship.png";

    bulletImage = new Image();
    bulletImage.src="image/bullet.png";

    alienImage = new Image();
    alienImage.src="image/alien.png";

    gameOverImage = new Image();
    gameOverImage.src="image/gameOver.png";
}

let keysDown={}
function setupKeyboardListener()
{
    document.addEventListener("keydown", function(event)
    {
        keysDown[event.keyCode] = true;
        console.log("keydown: ", keysDown);
    });
    document.addEventListener("keyup", function(event)
    {
        delete keysDown[event.keyCode];
        if(event.keyCode == 32) // 32 is space bar number
        {
            createBullet();
        }
    });
}

function createBullet()
{
    console.log();
    let b = new Bullet();
    b.init();
    
}

function update()
{
    if(39 in keysDown) //right 
    {
        spaceshipX += 2;
    }
    if(37 in keysDown) //left
    {
        spaceshipX -= 2;
    }
    if(spaceshipX <= 0)
    {
        spaceshipX = 0;
    }
    if(spaceshipX >= canvas.width-50)
    {
        spaceshipX = canvas.width-50;
    }

    //update the bullet in y axis
    for(let i = 0; i < bulletList.length; i++)
    {
        bulletList[i].update();
    }

}

function render()
{
    ctx.drawImage(spaceImage, 0, 0, canvas.width, canvas.height);
    ctx.drawImage(spaceshipImage, spaceshipX, spaceshipY);

    for(let i = 0; i < bulletList.length; i++)
    {
        ctx.drawImage(bulletImage, bulletList[i].x, bulletList[i].y);
    }
}
function main()
{
    update();  //update the coordinate values
    render();  //draw
    requestAnimationFrame(main);
}

loadImage();
setupKeyboardListener();
main();

//Make bullet
