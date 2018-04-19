package edu.washington.snalegave.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var playerOneLife = 20
    var playerTwoLife = 20
    var playerThreeLife = 20
    var playerFourLife = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logTextBox = findViewById<TextView>(R.id.log)

        // PLAYER 1
        val playerOnePlusOne: Button = findViewById(R.id.player1Button1)
        val playerOneLifeLabel = findViewById(R.id.player1LifeTot) as TextView
        // +1
        playerOnePlusOne.setOnClickListener {
            playerOneLife++
            playerOneLifeLabel.text = ("Life Total= " + playerOneLife.toString())
        }
        // -1
        val playerOneMinusOne: Button = findViewById(R.id.player1Button2)
        playerOneMinusOne.setOnClickListener {
            playerOneLife--
            playerOneLifeLabel.text = ("Life Total= " + playerOneLife.toString())
            if (playerOneLife <= 0 ){
                playerNLoses(1, logTextBox)
            }
        }
        // +5
        val playerOnePlusFive: Button = findViewById(R.id.player1Button3)
        playerOnePlusFive.setOnClickListener {
            playerOneLife+=5
            playerOneLifeLabel.text = ("Life Total= " + playerOneLife.toString())
        }
        // -5
        val playerOneMinusFive: Button = findViewById(R.id.player1Button4)
        playerOneMinusFive.setOnClickListener {
            playerOneLife-=5
            playerOneLifeLabel.text = ("Life Total= " + playerOneLife.toString())
            if (playerOneLife <= 0 ){
                playerNLoses(1, logTextBox)
            }
        }



        //Player 2
        val playerTwoLifeLabel = findViewById(R.id.player2LifeTot) as TextView
        // +1
        val playerTwoPlusOne: Button = findViewById(R.id.player2Button1)
        playerTwoPlusOne.setOnClickListener {
            playerTwoLife++
            playerTwoLifeLabel.text = ("Life Total= " + playerTwoLife.toString())
        }
        // -1
        val playerTwoMinusOne: Button = findViewById(R.id.player2Button2)
        playerTwoMinusOne.setOnClickListener {
            playerTwoLife--
            playerTwoLifeLabel.text = ("Life Total= " + playerTwoLife.toString())
            if (playerTwoLife <= 0 ){
                playerNLoses(2, logTextBox)
            }
        }
        // +5
        val playerTwoPlusFive: Button = findViewById(R.id.player2Button3)
        playerTwoPlusFive.setOnClickListener {
            playerTwoLife+=5
            playerTwoLifeLabel.text = ("Life Total= " + playerTwoLife.toString())
        }
        // -5
        val playerTwoMinusFive: Button = findViewById(R.id.player2Button4)
        playerTwoMinusFive.setOnClickListener {
            playerTwoLife-=5
            playerTwoLifeLabel.text = ("Life Total= " + playerTwoLife.toString())
            if (playerTwoLife <= 0 ){
                playerNLoses(2, logTextBox)
            }
        }

        //Player 3
        val playerThreeLifeLabel = findViewById(R.id.player3LifeTot) as TextView
        // +1
        val playerThreePlusOne: Button = findViewById(R.id.player3Button1)
        playerThreePlusOne.setOnClickListener {
            playerThreeLife++
            playerThreeLifeLabel.text = ("Life Total= " + playerThreeLife.toString())
        }
        // -1
        val playerThreeMinusOne: Button = findViewById(R.id.player3Button2)
        playerThreeMinusOne.setOnClickListener {
            playerThreeLife--
            playerThreeLifeLabel.text = ("Life Total= " + playerThreeLife.toString())
            if (playerThreeLife <= 0 ){
                playerNLoses(3, logTextBox)
            }
        }
        // +5
        val playerThreePlusFive: Button = findViewById(R.id.player3Button3)
        playerThreePlusFive.setOnClickListener {
            playerThreeLife+=5
            playerThreeLifeLabel.text = ("Life Total= " + playerThreeLife.toString())
        }
        // -5
        val playerThreeMinusFive: Button = findViewById(R.id.player3Button4)
        playerThreeMinusFive.setOnClickListener {
            playerThreeLife-=5
            playerThreeLifeLabel.text = ("Life Total= " + playerThreeLife.toString())
            if (playerThreeLife <= 0 ){
                playerNLoses(3, logTextBox)
            }
        }

        //Player 4
        val playerFourLifeLabel = findViewById(R.id.player4LifeTot) as TextView
        // +1
        val playerFourPlusOne: Button = findViewById(R.id.player4Button1)
        playerFourPlusOne.setOnClickListener {
            playerFourLife++
            playerFourLifeLabel.text = ("Life Total= " + playerFourLife.toString())
        }
        // -1
        val playerFourMinusOne: Button = findViewById(R.id.player4Button2)
        playerFourMinusOne.setOnClickListener {
            playerFourLife--
            playerFourLifeLabel.text = ("Life Total= " + playerFourLife.toString())
            if (playerFourLife <= 0 ){
                playerNLoses(4, logTextBox)
            }
        }
        // +5
        val playerFourPlusFive: Button = findViewById(R.id.player4Button3)
        playerFourPlusFive.setOnClickListener {
            playerFourLife+=5
            playerFourLifeLabel.text = ("Life Total= " + playerFourLife.toString())
        }
        // -5
        val playerFourMinusFive: Button = findViewById(R.id.player4Button4)
        playerFourMinusFive.setOnClickListener {
            playerFourLife-=5
            playerFourLifeLabel.text = ("Life Total= " + playerFourLife.toString())
            if (playerFourLife <= 0 ){
                playerNLoses(4, logTextBox)
            }
        }
    }

    private fun playerNLoses(i: Int, logTextBox: TextView) {
        when (i){
            1 -> logTextBox.text = "player 1 LOSES!\n" + logTextBox.text
            2 -> logTextBox.text ="Player 2 LOSES!\n" + logTextBox.text
            3 -> logTextBox.text = "Player 3 LOSES!\n" + logTextBox.text
            4 -> logTextBox.text = "Player 4 LOSES!\n" + logTextBox.text
            else -> logTextBox.text = "Invalid entry!\n" + logTextBox.text
        }
    }
}
