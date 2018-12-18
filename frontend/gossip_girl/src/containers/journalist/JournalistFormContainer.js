import React, {Component} from 'react';
import Request from '../../helpers/Request.js';
import JournalistForm from '../../components/journalist/JournalistForm.js';

class JournalistFormContainer extends Component {
  constructor(props) {
    super(props);
      this.state = {
        journalists: []
      }

      this.handleJournalistPost = this.handleJournalistPost.bind(this);
  }

  componentDidMount(){
    console.log("JFormContainer: Did Mount");
    const request = new Request();
    request.get("/journalists").then( (data) => {
      this.setState({journalists: data._embedded.journalists})
    })
  }

  handleJournalistPost(journalist){
    const request = new Request();
    request.get("/journalists").then( () => {
      window.location = '/journalists'
    })
  }

  render(){
    return (
      <JournalistForm
        journalists={this.state.journalists}
        handleJournalistPost={this.handleJournalistPost}
      />
    )
  }
}

export default JournalistFormContainer;
