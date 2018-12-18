import React, { Component } from 'react';
import JournalistList from '../../components/journalist/JournalistList.js';
import Request from '../../helpers/Request.js';
import './JournalistListContainer.css';

class JournalistListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {journalists: []}
  }

  componentDidMount() {
    let request = new Request()
    request.get('/journalists/').then((data) => {
      this.setState({journalists: data._embedded.journalists})
    })
  }

  render() {
    return (
      <JournalistList journalists = {this.state.journalists} />
    )
  }
}

export default JournalistListContainer;
